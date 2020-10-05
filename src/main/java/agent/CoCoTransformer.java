package agent;

import java.lang.instrument.*;
import java.security.ProtectionDomain;
import jdk.internal.org.objectweb.asm.*;

public class CoCoTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
        ProtectionDomain protectionDomain, byte[] classfileBuffer){
        if ("app/Main".equals(className)){
            System.out.println("\u001B[34m" + "transform class start:" + className + "\u001B[34m");
            ClassReader cr = new ClassReader(classfileBuffer);
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
            cr.accept(new ClassAdapter(cw), 0);
            System.out.println("\u001B[34m" + "transform class done:" + className + "\u001B[34m");
            return cw.toByteArray();
        }
        return classfileBuffer;
    }
}