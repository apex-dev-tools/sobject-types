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
public class CrbnCreditAlloc extends SObject {
	public static SObjectType$<CrbnCreditAlloc> SObjectType;
	public static SObjectFields$<CrbnCreditAlloc> Fields;

	public Decimal AllocatedCarbonCrCost;
	public Id AnnualEmssnInventoryId;
	public AnnualEmssnInventory AnnualEmssnInventory;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Decimal NetEmissionsInTco2e;
	public Decimal NetScope1EmssnInTco2e;
	public Decimal NetScope2EmssnInTco2e;
	public Decimal NetScope3EmssnInTco2e;
	public Id OwnerId;
	public Name Owner;
	public Decimal Scp1CrbnCrAllocInTco2e;
	public Decimal Scp2CrbnCrAllocInTco2e;
	public Decimal Scp3CrbnCrAllocInTco2e;
	public Datetime SystemModstamp;
	public Decimal TotalCrbnCrAllocInTco2e;
	public Decimal TotalEmssnInTco2e;
	public Decimal TotalScope1EmssnInTco2e;
	public Decimal TotalScope2EmssnInTco2e;
	public Decimal TotalScope3EmssnInTco2e;
	public String Year;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CrbnCreditAllocItem[] CarbonCreditAllocationItems;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CrbnCreditDistribution[] CrbnCreditdistributions;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CrbnCreditAllocFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CrbnCreditAllocHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CrbnCreditAllocShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CrbnCreditAlloc clone$() {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAlloc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAlloc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAlloc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAlloc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
