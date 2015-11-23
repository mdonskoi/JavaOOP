package FileMover;


import java.io.*;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        copy();
        System.out.println("Copy is completed");
    }

    private static void copy() throws IOException {

        System.out.println("Input name and path: ");
        Scanner scanner = new Scanner(System.in);
        String oldpath = scanner.next();

        File ofile = new File(oldpath);
        if ((!ofile.exists() || !ofile.isDirectory())) {
            if (oldpath.equals("end")) {
                System.out.println("Program ends");
                System.exit(-1);
            } else {
                System.out.println("Input outcome dir. (outcome dir is not correct) (end for exit)");
                copy();
            }
        }
        System.out.println("Input income dir: ");
        String newpath = scanner.next();

        File nfile = new File(newpath);
        if (!nfile.isAbsolute()) {
            if (newpath.equals("end")) {
                System.out.println("Program ends");
                System.exit(-1);
            } else {
                System.out.println("Input income dir. (incom dir is not correct) (tnd for exit)");
                copy();
            }
        }
        String laststr = oldpath.substring(oldpath.lastIndexOf("/"), oldpath.length());
        copyDirectory(oldpath, newpath + "/" + laststr);
    }

    public static void copyFile(File sourceFile, File targetFile) throws IOException {
        FileInputStream input = new FileInputStream(sourceFile);
        BufferedInputStream inBuff = new BufferedInputStream(input);

        FileOutputStream output = new FileOutputStream(targetFile);
        BufferedOutputStream outBuff = new BufferedOutputStream(output);

        int len;
        while ((len = inBuff.read()) != -1) {
            outBuff.write(len);
        }
        outBuff.flush();

        inBuff.close();
        outBuff.close();
        output.close();
        input.close();


    }

    public static void copyDirectory(String sourceDir, String targetDir) throws IOException {

        File aimfile = new File(targetDir);
        if (!(aimfile).exists()) {
            aimfile.mkdirs();
        }
        if (sourceDir.equals(targetDir)) {
            Scanner scanner = new Scanner(System.in);
            String NY = scanner.next();
            if (NY.equalsIgnoreCase("n")) {
                System.out.println("Program ends");
                System.exit(-1);
            }
        }

        File oldfile = new File(sourceDir);
        File[] file = oldfile.listFiles();

        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                File aim = new File(targetDir);
                File targetFile = new File(aim.getAbsolutePath() + "/" + file[i].getName());
                copyFile(file[i], targetFile);
            }
            if (file[i].isDirectory()) {
                String soursefiles = sourceDir + "/" + file[i].getName();

                String aimfiles = targetDir + "/" + file[i].getName();
            }
        }
    }

}
