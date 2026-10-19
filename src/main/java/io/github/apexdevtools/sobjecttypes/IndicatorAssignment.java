/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class IndicatorAssignment extends SObject {
	public static SObjectType$<IndicatorAssignment> SObjectType;
	public static SObjectFields$<IndicatorAssignment> Fields;

	public Id CareProgramId;
	public CareProgram CareProgram;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public String IndicatorAssignmentType;
	public Id IndicatorDefinitionId;
	public IndicatorDefinition IndicatorDefinition;
	public String IndicatorImprvGuideline;
	public Id IndividualApplicationId;
	public IndividualApplication IndividualApplication;
	public String IntendedDirection;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OutcomeId;
	public Outcome Outcome;
	public Id OwnerId;
	public Name Owner;
	public Id ProgramEnrollmentId;
	public ProgramEnrollment ProgramEnrollment;
	public Id ProgramId;
	public Program Program;
	public Id ProgramInitiativeId;
	public ProgramInitiative ProgramInitiative;
	public String Status;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public IndicatorAssignmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public IndicatorAssignmentHistory[] Histories;
	public IndicatorPerformancePeriod[] IndicatorPerformancePeriods;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public IndicatorAssignmentShare[] Shares;

	public IndicatorAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public IndicatorAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IndicatorAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IndicatorAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IndicatorAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
