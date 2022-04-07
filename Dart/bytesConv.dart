import 'dart:io';
import 'dart:async';

main() {
  var config = new File('file.txt');
  List<String> lines = config.readAsLinesSync();

  String line = lines[0];
  var parsed = line.split(' ');

  List<String> stuff = [];

  for (var i in parsed) {
    i = i.replaceAll(',', '');
    i = i.replaceAll('[', '');
    i = i.replaceAll(']', '');

    stuff.add(i);
  }

  bool start = false;
  bool end = false;
  List<String> moreStuff = [];

  for (var x in stuff) {
    if (x == "readStream:") {
      end = true;
    }

    if (start && !end) {
      moreStuff.add(x);
    }
    if (x == "bytes:") {
      start = true;
    }
  }

  List<int> evenMoreStuff = [];
  for (var q in moreStuff) {
    int num = int.parse(q);
    evenMoreStuff.add(num);
  }

  //File outfile = new File("main.txt");

  var source = StringBuffer();

  evenMoreStuff.forEach((element) {
    String? line = String.fromCharCode(element);
    source.write(line);
  });

  var sourceCode = source.toString();
  print(sourceCode);

  var file = File('main.txt').writeAsString(sourceCode);
}
