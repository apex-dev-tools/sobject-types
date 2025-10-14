/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareBenefitVerifyRequest extends SObject {
	public static SObjectType$<CareBenefitVerifyRequest> SObjectType;
	public static SObjectFields$<CareBenefitVerifyRequest> Fields;

	public Id AssignedToId;
	public User AssignedTo;
	public Id AuthorizedPrescriptionId;
	public MedicationRequest AuthorizedPrescription;
	public Id BenefitCategoryCodeId;
	public CodeSet BenefitCategoryCode;
	public Datetime BillablePrdEndDateTime;
	public Datetime BillablePrdStartDateTime;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Id CareProgramId;
	public CareProgram CareProgram;
	public Id CaseId;
	public Case Case;
	public Id CoverageBenefitId;
	public CoverageBenefit CoverageBenefit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Decimal InitialFillDuration;
	public Decimal InitialFillQuantity;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MemberPlanId;
	public MemberPlan MemberPlan;
	public String Name;
	public Id OriginalPrescriptionId;
	public MedicationRequest OriginalPrescription;
	public Id PayerId;
	public Account Payer;
	public Id PlanId;
	public PurchaserPlan Plan;
	public Id PrescriberId;
	public HealthcareProvider Prescriber;
	public Id PrescriptionMedicationId;
	public Name PrescriptionMedication;
	public Id PriorityCodeId;
	public CodeSet PriorityCode;
	public Id ProviderId;
	public Name Provider;
	public Id RelatedCareBnftVerifyRequestId;
	public CareBenefitVerifyRequest RelatedCareBnftVerifyRequest;
	public String Request;
	public Datetime RequestDate;
	public Id RequestedById;
	public User RequestedBy;
	public Id RequesterId;
	public Name Requester;
	public Blob ResponseBody;
	public String ResponseContentType;
	public Integer ResponseLength;
	public String ResponseName;
	public String Status;
	public String StatusReason;
	public Datetime SystemModstamp;
	public String VerificationMode;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_CareBenefitVerifyRequest;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CoverageBenefit[] CoverageBenefit_CareBenefitVerifyRequest;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareBenefitVerifyRequestFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareBenefitVerifyRequestHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareBenefitVerifyRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
