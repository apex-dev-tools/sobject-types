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
public class FrgtHaulingEnrgyUse extends SObject {
	public static SObjectType$<FrgtHaulingEnrgyUse> SObjectType;
	public static SObjectFields$<FrgtHaulingEnrgyUse> Fields;

	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4EmissionsInKg;
	public Decimal Co2EmissionsInKg;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Distance;
	public String DistanceUnit;
	public Date EndDate;
	public String FreightHaulingMode;
	public Id FrgtHaulingEmssnFctrId;
	public FrgtHaulingEmssnFctr FrgtHaulingEmssnFctr;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Scope3Category;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Decimal Scope3EmissionsInTco2e;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Date StartDate;
	public Decimal SuplScope3Emissions;
	public Id SupplierId;
	public Supplier Supplier;
	public Datetime SystemModstamp;
	public Decimal Weight;
	public String WeightUnit;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
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
	public FrgtHaulingEnrgyUseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public FrgtHaulingEnrgyUseHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FrgtHaulingEnrgyUseShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public FrgtHaulingEnrgyUse clone$() {throw new java.lang.UnsupportedOperationException();}
	public FrgtHaulingEnrgyUse clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FrgtHaulingEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FrgtHaulingEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FrgtHaulingEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
