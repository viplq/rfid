package br.com.devsource.rfid.api.leitor;

import java.util.Set;
import java.util.stream.Collectors;

public interface Leitor extends Comparable<Leitor> {

  String hotName();

  int porta();

  Protocolo protocolo();

  Set<Antena> antenas();

  default Set<Antena> antenasAtivas() {
    return antenas().stream().filter(Antena::ativa).collect(Collectors.toSet());
  }

}
