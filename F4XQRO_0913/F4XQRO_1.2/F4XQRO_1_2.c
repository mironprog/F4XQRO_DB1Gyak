#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

void pelda_1();
void olvas();

int main()
{

pelda_1();
olvas();
return 0;
}

void pelda_1() 
{
FILE *fp;
char ch;
char fnev[50];
printf("Filenev: ");
scanf("%s", fnev);
fp = fopen(fnev, "w");
printf("Üzenet ");
while( (ch = getchar()) != '#') {
putc(ch, fp);
}
fclose(fp);
fp = fopen(fnev, "r");
while ( (ch = getc(fp)) != EOF ) {
printf("%c",ch);
}
fclose(fp);

}

void olvas()
{

   FILE *fp1, *fp2;
   char a;
   //clrscr();
 
   fp1 = fopen("munka.txt", "r");
   if (fp1 == NULL) {
      puts("cannot open this file");
      exit(1);
   }
 
   fp2 = fopen("munka1.txt", "w");
   if (fp2 == NULL) {
      puts("Not able to open this file");
      fclose(fp1);
      exit(1);
   }
 
   do {
      a = fgetc(fp1);
      a = toupper(a);
      fputc(a, fp2);
   } while (a != EOF);
 
   fclose(fp1);
   fclose(fp2);
   //getch();

    

}
