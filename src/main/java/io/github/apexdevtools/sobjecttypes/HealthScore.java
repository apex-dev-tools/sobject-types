/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class HealthScore extends SObject {
	public static SObjectType$<HealthScore> SObjectType;
	public static SObjectFields$<HealthScore> Fields;

	public Integer Age;
	public String AgeBand;
	public Integer AssessmentYear;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Integer ConditionCategoryCount;
	public String ConditionCategoryList;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentScore;
	public Datetime CurrentScoreDate;
	public String Gender;
	public String HierCondCategoryCodeList;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSubjectDisabled;
	public Boolean IsSubjectInstitutionalized;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Decimal PreviousScore;
	public Datetime PreviousScoreDate;
	public String ScoreAndDate;
	public Id ScoreCategoryId;
	public ScoreCategory ScoreCategory;
	public Decimal ScoreChangePercent;
	public Id ScoredAccountId;
	public Account ScoredAccount;
	public Id ScoredContactId;
	public Contact ScoredContact;
	public Id ScoredLeadId;
	public Lead ScoredLead;
	public Id SubjectId;
	public Name Subject;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthScoreFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthScoreHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ActionVisibility[] Visibilites;

	public HealthScore clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthScore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthScore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthScore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthScore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
