package org.redhat.demo.brmsdemomarketing;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "BRMS_Demo_Action")
public class Action implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ACTION_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "ACTION_ID_SEQ", name = "ACTION_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "Result")
   private java.lang.String result;

   @org.kie.api.definition.type.Label(value = "Selected")
   private java.lang.Boolean selected;

   @org.kie.api.definition.type.Label(value = "Executed")
   private java.lang.Boolean executed;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label(value = "ActionType")
   private org.redhat.demo.brmsdemomarketing.ActionType actionType;

   public Action()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getResult()
   {
      return this.result;
   }

   public void setResult(java.lang.String result)
   {
      this.result = result;
   }

   public java.lang.Boolean getSelected()
   {
      return this.selected;
   }

   public void setSelected(java.lang.Boolean selected)
   {
      this.selected = selected;
   }

   public java.lang.Boolean getExecuted()
   {
      return this.executed;
   }

   public void setExecuted(java.lang.Boolean executed)
   {
      this.executed = executed;
   }

   public org.redhat.demo.brmsdemomarketing.ActionType getActionType()
   {
      return this.actionType;
   }

   public void setActionType(
         org.redhat.demo.brmsdemomarketing.ActionType actionType)
   {
      this.actionType = actionType;
   }

   public Action(java.lang.Long id, java.lang.String result,
         java.lang.Boolean selected, java.lang.Boolean executed,
         org.redhat.demo.brmsdemomarketing.ActionType actionType)
   {
      this.id = id;
      this.result = result;
      this.selected = selected;
      this.executed = executed;
      this.actionType = actionType;
   }

}