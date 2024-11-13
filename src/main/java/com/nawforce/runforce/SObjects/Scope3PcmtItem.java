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
public class Scope3PcmtItem extends SObject {
	public static SObjectType$<Scope3PcmtItem> SObjectType;
	public static SObjectFields$<Scope3PcmtItem> Fields;

	public Decimal CalculatedScope3EmssnInTco2e;
	public String CalculationDetail;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id PcmtEmssnFctrSetItemId;
	public PcmtEmssnFctrSetItem PcmtEmssnFctrSetItem;
	public Id ProcurementSummaryId;
	public Scope3PcmtSummary ProcurementSummary;
	public Id ProductEmissionsFactorId;
	public ProductEmissionsFactor ProductEmissionsFactor;
	public Id ProductId;
	public Product2 Product;
	public Decimal PurchaseQuantity;
	public Date ReportDate;
	public String Scope3EmissionsCalculationType;
	public Decimal Scope3EmissionsInTco2;
	public String Scope3GhgCategory;
	public Decimal Scp3QtyBsdEmssnInTco2e;
	public Decimal Scp3UncatgEmissions;
	public String SpendingCategory1;
	public String SpendingCategory2;
	public String SpendingCategory3;
	public Decimal SpentAmount;
	public Date SpentDate;
	public Id SupplierId;
	public Supplier Supplier;
	public Id SustainabilityScorecardId;
	public SustainabilityScorecard SustainabilityScorecard;
	public Datetime SystemModstamp;
	public Decimal TotScpe3EmssnPerMillionSpent;
	public String UnitOfMeasure;
	public Decimal VendorPrvdScope3EmssnInTco2e;

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
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public Scope3PcmtItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Scope3PcmtItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public Scope3PcmtItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
