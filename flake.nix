{
  description = "Kanagawa Colors Theme — JetBrains plugin";

  inputs.nixpkgs.url = "github:NixOS/nixpkgs/nixos-25.11";

  outputs =
    { self, nixpkgs }:
    let
      system = "x86_64-linux";
      pkgs = nixpkgs.legacyPackages.${system};
    in
    {
      devShells.${system}.default = pkgs.mkShell {
        packages = [
          pkgs.jdk21
          pkgs.python3
        ];

        env.JAVA_HOME = "${pkgs.jdk21}";
      };
    };
}
