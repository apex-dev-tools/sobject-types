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
public class AirTravelEmssnFctr extends SObject {
	public static SObjectType$<AirTravelEmssnFctr> SObjectType;
	public static SObjectFields$<AirTravelEmssnFctr> Fields;

	public Decimal Ch4PsgrKmLongHaulInKgCo2e;
	public Decimal Ch4PsgrKmMediumHaulInKgCo2e;
	public Decimal Ch4PsgrKmShortHaulInKgCo2e;
	public Decimal Ch4PsgrMileLongHaulInKgCo2e;
	public Decimal Ch4PsgrMileMediumHaulInKgCo2e;
	public Decimal Ch4PsgrMileShortHaulInKgCo2e;
	public Decimal Co2PsgrKmLongHaulInKg;
	public Decimal Co2PsgrKmMediumHaulInKg;
	public Decimal Co2PsgrKmShortHaulInKg;
	public Decimal Co2PsgrMileLongHaulInKg;
	public Decimal Co2PsgrMileMediumHaulInKg;
	public Decimal Co2PsgrMileShortHaulInKg;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DistanceUnit;
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
	public Decimal LongHaulMinimumDistance;
	public Decimal MediumHaulMaximumDistance;
	public Decimal N2oPsgrKmLongHaulInKgCo2e;
	public Decimal N2oPsgrKmMediumHaulInKgCo2e;
	public Decimal N2oPsgrKmShortHaulInKgCo2e;
	public Decimal N2oPsgrMileLongHaulInKgCo2e;
	public Decimal N2oPsgrMileMediumHaulInKgCo2e;
	public Decimal N2oPsgrMileShortHaulInKgCo2e;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public Decimal ShortHaulMaximumDistance;
	public Boolean ShouldLockDtastUpdtForRec;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AirTravelEnrgyUse[] AirTravelEnergyUse;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Scope3EmssnSrc[] ChildAssetsAirTravelEmssnFctr;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AirTravelEmssnFctrFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AirTravelEmssnFctrHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AirTravelEmssnFctrShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public AirTravelEmssnFctr clone$() {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
