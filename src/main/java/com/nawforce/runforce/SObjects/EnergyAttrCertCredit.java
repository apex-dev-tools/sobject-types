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
public class EnergyAttrCertCredit extends SObject {
	public static SObjectType$<EnergyAttrCertCredit> SObjectType;
	public static SObjectFields$<EnergyAttrCertCredit> Fields;

	public Id CleanEnergyProjectId;
	public CleanEnergyProject CleanEnergyProject;
	public String CleanEnergyType;
	public Decimal CostPerUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditsAllocatedInMwh;
	public Decimal CreditsAvailableInMwh;
	public Date CreditsIssueDate;
	public Decimal CreditsPurchasedInMwh;
	public Date CreditsRetiredDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id EnergyAttrCertPurchaseId;
	public EnergyAttrCertPurchase EnergyAttrCertPurchase;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRetired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Date PurchaseDate;
	public Id SupplierId;
	public Supplier Supplier;
	public Datetime SystemModstamp;
	public Decimal TotalCost;
	public String VintagePeriod;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EnergyAttrCreditDstr[] EnergyAttributeCreditDistributionCredit;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EnergyAttrCertCreditFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public EnergyAttrCertCreditHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public EnergyAttrCertCreditShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public EnergyAttrCertCredit clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCredit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCredit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
