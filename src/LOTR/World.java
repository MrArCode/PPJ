package LOTR;

import java.util.Scanner;

public class World {


    public static void mapMenu(Character hero) {
        Scanner scanner = new Scanner(System.in);

        showMap();
        System.out.println("This is Middle-Earth, where would you like to travel?");
        System.out.println("" +
                "1.Mordor" +
                "\n2.Erebor" +
                "\n3.Minas Tirith" +
                "\n4.Rohan" +
                "\n5.Isengard" +
                "\n6.Fangorn Forest" +
                "\n7.Lothlorien" +
                "\n8.Rivendell" +
                "\n9.Shire" +
                "\n10.Return to main menu" +
                "\nType a number: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                Location.locationAction(Location.LocationFactory.crateMordor(), hero);
            }
            case 2 -> {
                Location.locationAction(Location.LocationFactory.createErebor(), hero);
            }
            case 3 -> {
                Location.locationAction(Location.LocationFactory.createMinasTirith(), hero);
            }
            case 4 -> {
                Location.locationAction(Location.LocationFactory.createRohan(), hero);
            }
            case 5 -> {
                Location.locationAction(Location.LocationFactory.createIsengard(), hero);
            }
            case 6 -> {
                Location.locationAction(Location.LocationFactory.createFangornForest(), hero);
            }
            case 7 -> {
                Location.locationAction(Location.LocationFactory.createLothlorien(), hero);
            }
            case 8 -> {
                Location.locationAction(Location.LocationFactory.createRivendell(), hero);
            }
            case 9 -> {
                Location.locationAction(Location.LocationFactory.createShire(), hero);
            }
            case 10 -> {
                GameMethods.gameMenu(hero);
                break;
            }

        }
    }

    public static void showMap() {
        System.out.println("""
                =====================================================================================================\s
                |-----------------------?,:]-----------                                                             |\s
                |------------------------["''_--------;                                                             |\s
                |---------------------------]----?>:`'                                                              |\s
                |----------------------]-?-------~`                                                                 |\s
                |----------------]<I<_?,^?--->"`^"I'...'.                                                           |\s
                |------------?!;`,<[!,..^~>;<~^   .'`^,,"^..'..                                                     |\s
                |----------?^.`~I}I  ...                   .'":;Il'              .''                                |\s
                |----------?:"`._+i    ..  ^`'                  .'^;^.'``^"`!"^:"`"`"''.                            |\s
                |---------?;^'.')>?....'  `:>}?^              ^"'  ;[,..` ...      .                                |\s
                |-------;^'  .`^][{`   .. .:<i' =====  'I}):.      .^`''``?i.'    ...    .`      ^`''``"^^'         |\s
                |-------"   .   `_?"   .''l{+\\,X 9 X          ===== .?l"'.      '...''        =====`..  .           |\s
                |------[.  ..   ^(;   ..  .''' '===== ;`      .X 8 X .ii,.`     ''"^` `        X 2 X                |\s
                |-------<.  ,"` ',,^",     ..  ' ..    '"    ..====="+[,  '           '.       =====                |\s
                |--------]],>--??i<+>` ;!.^..   .`l`.'...    '  .. `i+>"' '.            '. ..    `                  |\s
                |----------->;,`! `+)_,.         ..  '`'..   '..  .+<+:'..'               .  ...`                   |\s
                |-----------,    .([_,.''''     ..         ..'  'I1--"   ===== '                      `             |\s
                |-----------:''  .l![>`.     ...         ..      lI<!'   X 7 X                  ......'^    '"      |\s
                |-------------['   ."I`  '..'          .'......`,;l^:`  .=====                          ~]]-_-{.    |\s
                |--------------?:,"`'   ^.          ...        .,_,.....'                             `-------?"    |\s
                |-------------------->,!l .        .           ^:,.  =====   ..                         .,?^l--<;?[ |\s
                |----------------------[',1     ...         =====,.  X 6 X'`                        ">I^~`  '~.     |\s
                |----------------------?_--    .`           X 5 X    =====   .`.                     .`''^'.        |\s
                |-------------------------?^.`,~            =====   ..     .`                                       |\s
                |---------------------------?--[.                      `    .'                                      |\s
                |------------------------------"  ...  .''''..,"^.   =====  `     ^                          ....   |\s
                |------------------------------i,.   ..     .'';i~!^,X 4 X.    ,.     ,!`!"`''.'''``^`^,"I"l:^'..   |\s
                |------------------------------]`     ,^^^'^I}]<>";,:=====',:;`.  .}+.'                             |\s
                |------------------------------?^ `:^   ..'Il. ... "^:<:!:=====  '".>}` '".     .:~^' .'.           |\s
                |-------------------------------,'I;.`.'. . ..'' .`'^'``^'X 3 X->>^.''^I      .=====     '..        |\s
                |-------------------------------}::^'. '`^^^`"^`'  ''.`..`====='.`` `{}"..'   .X 1 X     `          |\s
                |-----------------------------?il::. ^` .^,;-<I?]>_;`.^^` .'`  `  ` "[!,``''   =====    .';. .'`'.  |\s
                |---------------------------_:,Ii!l^`;i^---------?i.^:^'`.`'   `.'  ""::                            |\s
                |---------------------------_~?-------------------?^ `i[>,"^''^.  ..'l~;.'.'...'"`'`:` .:>".        |\s
                |---------------------------------------------------<+{1[]>.   ..    ^"I"`````'`",,^;^:^'.          |\s
                |----------------------------------------------------?_??"           .'.' ''^``^'.....              |\s
                |--------------------------------------------------------"                `                         |\s
                |-------------------------------------------------------?`              '.                          |\s
                =====================================================================================================\s
                """);
    }

}
