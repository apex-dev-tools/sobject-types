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
public class SurveyQuestion extends SObject {
	public static SObjectType$<SurveyQuestion> SObjectType;
	public static SObjectFields$<SurveyQuestion> Fields;

	public String AdditionalInfo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDeprecated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer PageDisplayOrder;
	public String PageName;
	public Integer QuestionChoiceCount;
	public String QuestionName;
	public Integer QuestionOrder;
	public String QuestionType;
	public Id SurveyPageId;
	public SurveyPage SurveyPage;
	public Id SurveyVersionId;
	public SurveyVersion SurveyVersion;
	public Datetime SystemModstamp;
	public String ValidationType;

	public ActivityHistory[] ActivityHistories;
	public EmailMessage[] Emails;
	public Event[] Events;
	public OpenActivity[] OpenActivities;
	public SurveyQuestionChoice[] QuestionChoices;
	public SurveyQuestionResponse[] SurveyQuestionResponses;
	public SurveyQuestionScore[] SurveyQuestionScores;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public SurveyQuestion clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
