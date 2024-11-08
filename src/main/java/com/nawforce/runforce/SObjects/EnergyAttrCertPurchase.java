/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EnergyAttrCertPurchase extends SObject {
	public static SObjectType$<EnergyAttrCertPurchase> SObjectType;
	public static SObjectFields$<EnergyAttrCertPurchase> Fields;

	public String CertifiedBy;
	public Id CleanEnergyProjectId;
	public CleanEnergyProject CleanEnergyProject;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Decimal ExpectedAnnualPowerGnrn;
	public String ExternalIdentifier;
	public Id Id;
	public String InvoiceNumber;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal PlannedAnnualPowerGnrn;
	public String ProjRegistryIdentifier;
	public String PurchaseOrderNumber;
	public String PurchaseType;
	public Date StartDate;
	public Datetime SystemModstamp;
	public Decimal TotEnrgyAttrCrAllocMwh;
	public Decimal TotEnrgyAttrCrAvlMwh;
	public Decimal TotEnrgyAttrCrPurchMwh;
	public Decimal TotalSpend;
	public String TradeLocation;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EnergyAttrCertCredit[] EACCreditEnergyAttrCertPurchase;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EnergyAttrCertPurchaseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public EnergyAttrCertPurchaseHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public EnergyAttrCertPurchaseShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public EnergyAttrCertPurchase clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchase clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchase clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchase clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchase clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
