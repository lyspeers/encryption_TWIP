package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ls059 on 10/16/17.
 */
/* use string builder class to store encryption key.
	StringBuilder x = new StringBuilder
	x.append("HI")
	use Integer.parseInt() with a string to get decryption key from user input
	int i = Integer.parseInt("576")
	SOP i + 4 outputs 580
	 */
public class Encryptor {

    public Encryptor(String w){
        encrypted = "";
        c = w;
        int k1 = (int)(Math.random()*10), k2 = (int)(Math.random()*10), k3 = (int)(Math.random()*10), k4 = (int)(Math.random()*10), k5 = (int)(Math.random()*10), k6 = (int)(Math.random()*10), k7 = (int)(Math.random()*10), k8 = (int)(Math.random()*10), k9 = (int)(Math.random()*10), k10 = (int)(Math.random()*10), k11 = (int)(Math.random()*10), k12 = (int)(Math.random()*10), k13 = (int)(Math.random()*10), k14 = (int)(Math.random()*10), k15 = (int)(Math.random()*10), k16 = (int)(Math.random()*10);
        StringBuilder key = new StringBuilder();
        key.append(k1);
        key.append(k2);
        key.append(k3);
        key.append(k4);
        key.append(k5);
        key.append(k6);
        key.append(k7);
        key.append(k8);
        key.append(k9);
        key.append(k10);
        key.append(k11);
        key.append(k12);
        key.append(k13);
        key.append(k14);
        key.append(k15);
        key.append(k16);
        mKey = key.toString();
        for(int i = 0;i< c.length();i++){
            if(i%16 == 0){
                encrypted += (char)(c.charAt(i) + k1);
            }else if(i%16 == 15){
                encrypted += (char)(c.charAt(i) + k2);
            }else if(i%16 == 14){
                encrypted += (char)(c.charAt(i) + k3);
            }else if(i%16 == 13){
                encrypted += (char)(c.charAt(i) + k4);
            }else if(i%16 == 12){
                encrypted += (char)(c.charAt(i) + k5);
            }else if(i%16 == 11){
                encrypted += (char)(c.charAt(i) + k6);
            }else if(i%16 == 10){
                encrypted += (char)(c.charAt(i) + k7);
            }else if(i%16 == 9){
                encrypted += (char)(c.charAt(i) + k8);
            }else if(i%16 == 8){
                encrypted += (char)(c.charAt(i) + k9);
            }else if(i%16 == 7){
                encrypted += (char)(c.charAt(i) + k10);
            }else if(i%16 == 6){
                encrypted += (char)(c.charAt(i) + k11);
            }else if(i%16 == 5){
                encrypted += (char)(c.charAt(i) + k12);
            }else if(i%16 == 4){
                encrypted += (char)(c.charAt(i) + k13);
            }else if(i%16 == 3){
                encrypted += (char)(c.charAt(i) + k14);
            }else if(i%16 == 2){
                encrypted += (char)(c.charAt(i) + k15);
            }else if(i%16 == 1){
                encrypted += (char)(c.charAt(i) + k16);
            }
        }
        System.out.println("Your key is " + mKey);
    }
    public void decryptor(String k){
        if(k.equals(mKey)){
            System.out.println("recived");
            decrypted = "";
            for(int i = 0;i< encrypted.length();i++){
                if(i%16 == 0){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(0)-'0'));
                }else if(i%16 == 15){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(1)-'0'));
                }else if(i%16 == 14){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(2)-'0'));
                }else if(i%16 == 13){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(3)-'0'));
                }else if(i%16 == 12){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(4)-'0'));
                }else if(i%16 == 11){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(5)-'0'));
                }else if(i%16 == 10){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(6)-'0'));
                }else if(i%16 == 9){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(7)-'0'));
                }else if(i%16 == 8){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(8)-'0'));
                }else if(i%16 == 7){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(9)-'0'));
                }else if(i%16 == 6){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(10)-'0'));
                }else if(i%16 == 5){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(11)-'0'));
                }else if(i%16 == 4){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(12)-'0'));
                }else if(i%16 == 3){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(13)-'0'));
                }else if(i%16 == 2){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(14)-'0'));
                }else if(i%16 == 1){
                    decrypted += (char)(encrypted.charAt(i) - (mKey.charAt(15)-'0'));
                }
            }
        }else{
            System.out.println("Please input the correct key");
        }
        System.out.println(decrypted);
    }
    public String encrypted;
    public String decrypted;
    public String mKey;
    public String c;

}
