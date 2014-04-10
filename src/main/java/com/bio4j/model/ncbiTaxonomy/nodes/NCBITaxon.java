package com.bio4j.model.ncbiTaxonomy.nodes;

import java.util.List;

import com.bio4j.model.Node;
import com.bio4j.model.NodeType;

// properties
import com.bio4j.model.properties.Name;
import com.bio4j.model.properties.Comment;
import com.bio4j.model.properties.TaxId;
import com.bio4j.model.properties.ScientificName;
import com.bio4j.model.properties.TaxonomicRank;
import com.bio4j.model.properties.EmblCode;

// relationships
import com.bio4j.model.ncbiTaxonomy.relationships.Parent;

import com.bio4j.model.uniprot.nodes.Taxon;


/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 * @author Eduardo Pareja-Tobes <eparejatobes@ohnosequences.com>
 */
public interface NCBITaxon extends Node<NCBITaxon, NCBITaxon.Type>,
  
  // properties
  TaxId<NCBITaxon, NCBITaxon.Type>, // TODO what is this? probably should be changed to id
  Name<NCBITaxon, NCBITaxon.Type>,
  Comment<NCBITaxon, NCBITaxon.Type>, // WARNING changed comments to comment
  ScientificName<NCBITaxon, NCBITaxon.Type>,
  TaxonomicRank<NCBITaxon, NCBITaxon.Type>, // WARNING this was rank before
  EmblCode<NCBITaxon, NCBITaxon.Type> // TODO maybe this should be promoted to a rel

{
  
  // parent
  // incoming
  public List<? extends Parent> in_parent();
  public List<? extends Taxon> in_parent_nodes();
  // outgoing
  public Parent out_parent();
  public Taxon out_parent_nodes();

  // TODO what is this??
  public Taxon taxon();

  public static Type TYPE = Type.ncbiTaxon;  
  public static enum Type implements NodeType<NCBITaxon, NCBITaxon.Type> {
    ncbiTaxon;
    public Type value() { return ncbiTaxon; }
  }
}
