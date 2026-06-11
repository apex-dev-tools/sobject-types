/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AssessmentTaskIndDefinition extends SObject {
	public static SObjectType$<AssessmentTaskIndDefinition> SObjectType;
	public static SObjectFields$<AssessmentTaskIndDefinition> Fields;

	public Id AssessmentIndDefinitionId;
	public AssessmentIndicatorDefinition AssessmentIndDefinition;
	public Id AssessmentTaskDefinitionId;
	public AssessmentTaskDefinition AssessmentTaskDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DisplayOrder;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AssessmentTaskIndDefinitionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AssessmentTaskIndDefinitionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AssessmentIndValue[] SourceObjects;

	public AssessmentTaskIndDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTaskIndDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTaskIndDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTaskIndDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTaskIndDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
