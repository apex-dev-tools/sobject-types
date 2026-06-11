/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Survey extends SObject {
	public static SObjectType$<Survey> SObjectType;
	public static SObjectFields$<Survey> Fields;

	public Id ActiveVersionId;
	public SurveyVersion ActiveVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LatestVersionId;
	public SurveyVersion LatestVersion;
	public String Name;
	public String NamespacePrefix;
	public Id OwnerId;
	public Name Owner;
	public String SurveyType;
	public Datetime SystemModstamp;
	public Integer TotalVersionsCount;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public SurveyFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SurveyShare[] Shares;
	public SurveyInvitation[] SurveyInvitations;
	public SurveyQuestionScore[] SurveyQuestionScores;
	public SurveyResponse[] SurveyResponses;
	public SurveySubject[] SurveySubjects;
	public SurveyVersion[] SurveyVersions;
	public TopicAssignment[] TopicAssignments;

	public Survey clone$() {throw new java.lang.UnsupportedOperationException();}
	public Survey clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Survey clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Survey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Survey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
