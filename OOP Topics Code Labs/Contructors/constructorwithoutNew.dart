class ABC {
  int? a;
  int? b;

  ABC() {
    print("Pakistan noor hai aur noor ko zawaal nhi");
  }
}

void main(List<String> args) {
  ABC? abc; // not working as we have not called the constructor

  // print(abc!.a);
}
