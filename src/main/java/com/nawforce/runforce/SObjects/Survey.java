/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
