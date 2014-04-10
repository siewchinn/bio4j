package com.bio4j.model.refseq.relationships;

import com.bio4j.model.Relationship;
import com.bio4j.model.RelationshipType;

// source and target
import com.bio4j.model.refseq.nodes.GenomeElement;
import com.bio4j.model.refseq.nodes.TRNA;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 * @author Eduardo Pareja-Tobes <eparejatobes@ohnosequences.com>
 */
public interface TRNAs extends Relationship <
  GenomeElement, GenomeElement.Type,
  TRNAs,  TRNAs.Type,
  TRNA, TRNA.Type
> {

  @Override
  public GenomeElement source();
  @Override
  public TRNA target();

  public static Type TYPE = Type.tRNAs;
  public static enum Type implements RelationshipType <
    GenomeElement, GenomeElement.Type,
    TRNAs,  TRNAs.Type,
    TRNA, TRNA.Type
  > {
    tRNAs;
    public Type value() { return tRNAs; }
    public Arity arity() { return Arity.manyToMany; } // TODO review this
    public GenomeElement.Type sourceType() { return GenomeElement.TYPE; }
    public TRNA.Type targetType() { return TRNA.TYPE; }
  }
}
