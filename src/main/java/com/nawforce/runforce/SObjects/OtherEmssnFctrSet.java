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
public class OtherEmssnFctrSet extends SObject {
	public static SObjectType$<OtherEmssnFctrSet> SObjectType;
	public static SObjectFields$<OtherEmssnFctrSet> Fields;

	public Decimal Ch4GlblWarmingPot;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal N2oGlblWarmingPot;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public Decimal RefrigerantLeakageRtInKgItKwh;
	public Decimal RefrigerantLeakageRtInKgM2;
	public Decimal RefrigerantLeakageRtInKgSqft;
	public Boolean ShouldLockDtastUpdtForRec;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public ElectricityEmssnFctrSet[] ElectricityEmssnFctrSetOtherEmssnFctr;
	public EmailMessage[] Emails;
	public RentalCarEmssnFctr[] EmissionFactorsRentalCar;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OtherEmssnFctrSetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FrgtHaulingEmssnFctr[] FrgtHaulingEmssnFctrOtherEmssnFctr;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OtherEmssnFctrSetHistory[] Histories;
	public OtherEmssnFctrSetItem[] LineItems;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public OtherEmssnFctrSetShare[] Shares;
	public StnryAssetEnvrSrc[] StationaryAssetEmissionSources;
	public StnryAssetEnrgyUse[] StationaryAssetEnergyUse;
	public VehicleAssetEnrgyUse[] SustainabilityEnergyConsumption;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public VehicleAssetEmssnSrc[] VehicleAssetEmissionSources;

	public OtherEmssnFctrSet clone$() {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSet clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSet clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
