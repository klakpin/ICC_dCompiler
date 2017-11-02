package compiler;

public interface Operations {

    int plus(int a, int b);

    float plus(float a, int b);

    float plus(int a, float b);

    float plus(float a, float b);

    String plus(String str1, String str2);

    Cortaige plus(Cortaige crt1, Cortaige crt2);

    Structure plus(Structure str1, Structure str2);

    Cortaige plus(Cortaige crt1, Structure str1);
}
