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
public class OtherEmssnFctrSetItem extends SObject {
	public static SObjectType$<OtherEmssnFctrSetItem> SObjectType;
	public static SObjectFields$<OtherEmssnFctrSetItem> Fields;

	public Decimal CalorificValue;
	public String CalorificValueUnit;
	public Decimal Ch4EmissionFactor;
	public String Ch4EmissionFactorUnit;
	public Decimal Co2EmissionFactor;
	public String Co2EmissionFactorUnit;
	public Decimal Co2eEmissionFactorInTco2eGj;
	public Decimal Co2eEmissionFactorInTco2eMwh;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalIdentifier;
	public String FuelType;
	public Id FuelTypeRefId;
	public FuelType FuelTypeRef;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal N2oEmissionFactor;
	public String N2oEmissionFactorUnit;
	public String Name;
	public Id ParentEmissionFactorId;
	public OtherEmssnFctrSet ParentEmissionFactor;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public Boolean ShouldLockDtastUpdtForRec;
	public Decimal SuppliedEmissionsFactor;
	public String SuppliedEmissionsFactorUnit;
	public Datetime SystemModstamp;

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
	public OtherEmssnFctrSetItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OtherEmssnFctrSetItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public OtherEmssnFctrSetItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
