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
public class CodeSetBundle extends SObject {
	public static SObjectType$<CodeSetBundle> SObjectType;
	public static SObjectFields$<CodeSetBundle> Fields;

	public Id CodeSet10Id;
	public CodeSet CodeSet10;
	public Id CodeSet11Id;
	public CodeSet CodeSet11;
	public Id CodeSet12Id;
	public CodeSet CodeSet12;
	public Id CodeSet13Id;
	public CodeSet CodeSet13;
	public Id CodeSet14Id;
	public CodeSet CodeSet14;
	public Id CodeSet15Id;
	public CodeSet CodeSet15;
	public Id CodeSet1Id;
	public CodeSet CodeSet1;
	public Id CodeSet2Id;
	public CodeSet CodeSet2;
	public Id CodeSet3Id;
	public CodeSet CodeSet3;
	public Id CodeSet4Id;
	public CodeSet CodeSet4;
	public Id CodeSet5Id;
	public CodeSet CodeSet5;
	public Id CodeSet6Id;
	public CodeSet CodeSet6;
	public Id CodeSet7Id;
	public CodeSet CodeSet7;
	public Id CodeSet8Id;
	public CodeSet CodeSet8;
	public Id CodeSet9Id;
	public CodeSet CodeSet9;
	public String CodeSetBundleKey;
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
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public ClinicalServiceRequest[] BodySites;
	public BundledCareFeeAgreement[] Bundled_Care_Fee_Agreement_Procedures;
	public ClinicalDetectedIssueDetail[] CDetectedIssueDetailCodes;
	public CareBarrierType[] CareBarrierDignosisCodeSet;
	public CareFeeScheduleItem[] CareFeeScheduleItems;
	public CareInterventionType[] CareInterventionDignosisCodeSet;
	public CareMetricTarget[] CarePlanDetailCodeMeasureCode;
	public CareProcessingError[] CareProcessingErrorActionCode;
	public CareProcessingError[] CareProcessingErrorErrorCode;
	public CareTask[] CareTaskActionCodes;
	public CareTaskDetail[] CareTaskDetailDetailCode;
	public CareTask[] CareTaskProcessStatus;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_PrescriptionMedication;
	public ClinicalServiceRequest[] Categorys;
	public ClinicalDetectedIssue[] ClinicalDetectedIssue_CategoryCodes;
	public ClinicalEncounterFacility[] Clinical_Encounter_FacilityType;
	public ClinicalServiceRequest[] Clinical_Service_Requests1;
	public HierCondHlthCodeMapping[] ConditionCodes;
	public CareProgramDetail[] DetailRecords;
	public ClinicalServiceRequest[] FacilityCodes;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public HealthcareServiceDetail[] HcServiceDetailCodes;
	public CodeSetBundleHistory[] Histories;
	public MedicationStatementDetail[] MedicationStatementDetailCodes;
	public PatientImmunizationProtocol[] PatientImmunizationProtocolDetail1;
	public PatientImmunizationProtocol[] PatientImmunizationProtocolDetail2;
	public PatientImmunizationProtocol[] PatientImmunizationProtocolDetail3;
	public PatientImmunizationProtocol[] PatientImmunizationProtocolDetail4;
	public PatientImmunizationProtocol[] PatientImmunizationProtocolDetail5;
	public PatientImmunizationProtocol[] PatientImmunizationProtocolDetail6;
	public PatientImmunization[] Patient_Immunization_Information_Sources;
	public PatientImmunization[] Patient_Immunization_Reason_Codes;
	public PatientImmunization[] Patient_Immunization_Routes;
	public PatientImmunization[] Patient_Immunization_Sites;
	public PatientImmunization[] Patient_Immunization_Status_Reason_Codes;
	public PatientImmunization[] Patient_Immunization_Subpotency_Reason_Codes;
	public PatientImmunization[] Patient_Immunizations_Vaccine_Codes;
	public PercentileBsdCareFeeAgreement[] PercentileBasedCareFeeAgreements;
	public ClinicalServiceRequest[] PerformerTypes;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareRequestItem[] ReasonCodeCareRequestItems;
	public ClinicalServiceRequest[] ReasonCodes;
	public ClinicalServiceRequest[] RequestCodes;
	public CodeSetBundleShare[] Shares;
	public StandardCareFeeAgreement[] StandardCareFeeAgreements;

	public CodeSetBundle clone$() {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundle clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundle clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
