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
public class PatientMedicationDosage extends SObject {
	public static SObjectType$<PatientMedicationDosage> SObjectType;
	public static SObjectFields$<PatientMedicationDosage> Fields;

	public String AdditionalInstruction;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DosageDefinitionType;
	public Decimal DosageQuantityDenominator;
	public Decimal DosageQuantityNumerator;
	public String DosageQuantityType;
	public Decimal DosageRateDenominator;
	public Decimal DosageRateNumerator;
	public String DosageRateType;
	public Id DosageRateUnitId;
	public UnitOfMeasure DosageRateUnit;
	public Id DosageUnitId;
	public UnitOfMeasure DosageUnit;
	public Id DosePrerequisiteId;
	public CodeSetBundle DosePrerequisite;
	public Id Id;
	public Boolean IsAsNeeded;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MethodId;
	public CodeSetBundle Method;
	public String Name;
	public Id ParentRecordId;
	public Name ParentRecord;
	public String PatientInstruction;
	public Id RouteId;
	public CodeSetBundle Route;
	public Decimal Sequence;
	public Id SiteId;
	public CodeSetBundle Site;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime SystemModstamp;
	public Id TimingId;
	public ActivityTiming Timing;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PatientMedicationDosageFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PatientMedicationDosageHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public PatientMedicationDosage clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
