package org.redhat.demo.brmsdemomarketing;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "BRMS_Demo_Client")
public class Client implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CLIENT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "CLIENT_ID_SEQ", name = "CLIENT_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Contract Id")
   private java.lang.String contractId;

   @org.kie.api.definition.type.Label("Client code")
   private java.lang.String clientCode;

   @org.kie.api.definition.type.Label("Comercial delegation")
   private java.lang.String comercialDelegation;

   @org.kie.api.definition.type.Label("Parent comercial region")
   private java.lang.String parentComercialRegion;

   @org.kie.api.definition.type.Label("Last MTO prev")
   private java.lang.String lastMTOPrev;

   @org.kie.api.definition.type.Label("Last MTO rev")
   private java.lang.String lastMTORev;

   @org.kie.api.definition.type.Label("Last Jump")
   private java.lang.String lastJump;

   @org.kie.api.definition.type.Label("Antiquity")
   private java.lang.Integer antiquity;

   @org.kie.api.definition.type.Label("Panel")
   private java.lang.String panel;

   @org.kie.api.definition.type.Label("Local subtype")
   private java.lang.String localSubtype;

   @org.kie.api.definition.type.Label("Total Rec")
   private java.lang.Double totalRec;

   @org.kie.api.definition.type.Label("Price Contract")
   private java.lang.Integer priceContract;

   @org.kie.api.definition.type.Label("Detection Points")
   private java.lang.Integer detectionPoints;

   @org.kie.api.definition.type.Label("Scoring")
   private java.lang.Double scoring;

   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label("Action")
   private java.util.List<org.redhat.demo.brmsdemomarketing.Action> actions;

   @org.kie.api.definition.type.Label("Result")
   private String result;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label("Capacity")
   private org.redhat.demo.brmsdemomarketing.Capacity capacity;

   public Client()
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

   public java.lang.String getContractId()
   {
      return this.contractId;
   }

   public void setContractId(java.lang.String contractId)
   {
      this.contractId = contractId;
   }

   public java.lang.String getClientCode()
   {
      return this.clientCode;
   }

   public void setClientCode(java.lang.String clientCode)
   {
      this.clientCode = clientCode;
   }

   public java.lang.String getComercialDelegation()
   {
      return this.comercialDelegation;
   }

   public void setComercialDelegation(java.lang.String comercialDelegation)
   {
      this.comercialDelegation = comercialDelegation;
   }

   public java.lang.String getParentComercialRegion()
   {
      return this.parentComercialRegion;
   }

   public void setParentComercialRegion(java.lang.String parentComercialRegion)
   {
      this.parentComercialRegion = parentComercialRegion;
   }

   public java.lang.String getLastMTOPrev()
   {
      return this.lastMTOPrev;
   }

   public void setLastMTOPrev(java.lang.String lastMTOPrev)
   {
      this.lastMTOPrev = lastMTOPrev;
   }

   public java.lang.String getLastMTORev()
   {
      return this.lastMTORev;
   }

   public void setLastMTORev(java.lang.String lastMTORev)
   {
      this.lastMTORev = lastMTORev;
   }

   public java.lang.String getLastJump()
   {
      return this.lastJump;
   }

   public void setLastJump(java.lang.String lastJump)
   {
      this.lastJump = lastJump;
   }

   public java.lang.Integer getAntiquity()
   {
      return this.antiquity;
   }

   public void setAntiquity(java.lang.Integer antiquity)
   {
      this.antiquity = antiquity;
   }

   public java.lang.String getPanel()
   {
      return this.panel;
   }

   public void setPanel(java.lang.String panel)
   {
      this.panel = panel;
   }

   public java.lang.String getLocalSubtype()
   {
      return this.localSubtype;
   }

   public void setLocalSubtype(java.lang.String localSubtype)
   {
      this.localSubtype = localSubtype;
   }

   public java.lang.Double getTotalRec()
   {
      return this.totalRec;
   }

   public void setTotalRec(java.lang.Double totalRec)
   {
      this.totalRec = totalRec;
   }

   public java.lang.Integer getPriceContract()
   {
      return this.priceContract;
   }

   public void setPriceContract(java.lang.Integer priceContract)
   {
      this.priceContract = priceContract;
   }

   public java.lang.Integer getDetectionPoints()
   {
      return this.detectionPoints;
   }

   public void setDetectionPoints(java.lang.Integer detectionPoints)
   {
      this.detectionPoints = detectionPoints;
   }

   public java.lang.Double getScoring()
   {
      return this.scoring;
   }

   public void setScoring(java.lang.Double scoring)
   {
      this.scoring = scoring;
   }

   public java.util.List<org.redhat.demo.brmsdemomarketing.Action> getActions()
   {
      return this.actions;
   }

   public void setActions(
         java.util.List<org.redhat.demo.brmsdemomarketing.Action> actions)
   {
      this.actions = actions;
   }

   public void addAction(String action)
   {
      org.redhat.demo.brmsdemomarketing.ActionType aTypeResult = null;

      if (action != null)
      {

         java.util.List<org.redhat.demo.brmsdemomarketing.ActionType> actionTypeList = this.getCapacity().getActionType();

         for (org.redhat.demo.brmsdemomarketing.ActionType aType : actionTypeList)
         {
            if (aType.getDesc().equals(action))
            {
               aTypeResult = aType;
            }
         }
         if (this.getActions() == null)
         {
            this.setActions(new java.util.ArrayList<org.redhat.demo.brmsdemomarketing.Action>());
         }

         if (aTypeResult != null)
         {
            java.util.List<org.redhat.demo.brmsdemomarketing.Action> ac = this.getActions();
            org.redhat.demo.brmsdemomarketing.Action act = new org.redhat.demo.brmsdemomarketing.Action();
            act.setActionType(aTypeResult);
            act.setSelected(new Boolean(true));
            act.setResult(action);
            ac.add(act);
            this.setActions(ac);
            System.out.println("Asigando");

         }

      }

   }

   public org.redhat.demo.brmsdemomarketing.Capacity getCapacity()
   {
      return this.capacity;
   }

   public void setCapacity(org.redhat.demo.brmsdemomarketing.Capacity capacity)
   {
      this.capacity = capacity;
   }

   public java.lang.String getResult()
   {
      return this.result;
   }

   public void setResult(java.lang.String result)
   {
      this.result = result;
   }

   public Client(java.lang.Long id, java.lang.String contractId,
         java.lang.String clientCode, java.lang.String comercialDelegation,
         java.lang.String parentComercialRegion, java.lang.String lastMTOPrev,
         java.lang.String lastMTORev, java.lang.String lastJump,
         java.lang.Integer antiquity, java.lang.String panel,
         java.lang.String localSubtype, java.lang.Double totalRec,
         java.lang.Integer priceContract, java.lang.Integer detectionPoints,
         java.lang.Double scoring,
         java.util.List<org.redhat.demo.brmsdemomarketing.Action> actions,
         java.lang.String result,
         org.redhat.demo.brmsdemomarketing.Capacity capacity)
   {
      this.id = id;
      this.contractId = contractId;
      this.clientCode = clientCode;
      this.comercialDelegation = comercialDelegation;
      this.parentComercialRegion = parentComercialRegion;
      this.lastMTOPrev = lastMTOPrev;
      this.lastMTORev = lastMTORev;
      this.lastJump = lastJump;
      this.antiquity = antiquity;
      this.panel = panel;
      this.localSubtype = localSubtype;
      this.totalRec = totalRec;
      this.priceContract = priceContract;
      this.detectionPoints = detectionPoints;
      this.scoring = scoring;
      this.actions = actions;
      this.result = result;
      this.capacity = capacity;
   }

}