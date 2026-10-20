/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class HealthScoreChangeEvent extends SObject {
	public static SObjectType$<HealthScoreChangeEvent> SObjectType;
	public static SObjectFields$<HealthScoreChangeEvent> Fields;

	public Integer Age;
	public String AgeBand;
	public Integer AssessmentYear;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public ChangeEventHeader ChangeEventHeader;
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
	public Boolean IsSubjectDisabled;
	public Boolean IsSubjectInstitutionalized;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal PreviousScore;
	public Datetime PreviousScoreDate;
	public String ReplayId;
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
	public SObject Subject;

	public HealthScoreChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
