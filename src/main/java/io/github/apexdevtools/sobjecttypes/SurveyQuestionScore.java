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
public class SurveyQuestionScore extends SObject {
	public static SObjectType$<SurveyQuestionScore> SObjectType;
	public static SObjectFields$<SurveyQuestionScore> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CumulativeScore;
	public String CurrencyIsoCode;
	public Date DateResponse;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id QuestionChoiceId;
	public SurveyQuestionChoice QuestionChoice;
	public String QuestionDeveloperName;
	public Id QuestionId;
	public SurveyQuestion Question;
	public String QuestionName;
	public Integer QuestionSkippedCount;
	public Integer ResponseCount;
	public Decimal ResponseValue;
	public Decimal Score;
	public String ScoreType;
	public Id SurveyId;
	public Survey Survey;
	public Id SurveyInvitationId;
	public SurveyInvitation SurveyInvitation;
	public Id SurveyVersionId;
	public SurveyVersion SurveyVersion;
	public Datetime SystemModstamp;

	public SurveyQuestionScore clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionScore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionScore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionScore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionScore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
