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
public class GeneratedWaste extends SObject {
	public static SObjectType$<GeneratedWaste> SObjectType;
	public static SObjectFields$<GeneratedWaste> Fields;

	public String CalculationDetail;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DisposalSiteType;
	public String DisposalType;
	public Decimal DisposedWasteQuantity;
	public String DisposedWasteQuantityUnit;
	public Decimal DisposedWasteQuantityinTonnes;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsHazardous;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal Scope1EmissionsInTco2e;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Decimal Scp3DnstrmEndLifeSoldPrdct;
	public Decimal Scp3UpstrmWstGenInOper;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal SuplScope1EmissionsInTco2e;
	public Decimal SuplScp3DnstrmEndLifeSoldPrdct;
	public Decimal SuplScp3UpstrmWstGenInOper;
	public Id SupplierId;
	public Supplier Supplier;
	public Datetime SystemModstamp;
	public Id WasteFootprintId;
	public WasteFootprint WasteFootprint;
	public String WasteType;
	public Id WstDispoEmssnFctrId;
	public WstDispoEmssnFctrSet WstDispoEmssnFctr;

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
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public GeneratedWasteFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GeneratedWasteHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public GeneratedWasteShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public GeneratedWaste clone$() {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWaste clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWaste clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWaste clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWaste clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
