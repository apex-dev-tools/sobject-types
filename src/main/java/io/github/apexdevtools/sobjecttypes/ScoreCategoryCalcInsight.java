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
public class ScoreCategoryCalcInsight extends SObject {
	public static SObjectType$<ScoreCategoryCalcInsight> SObjectType;
	public static SObjectFields$<ScoreCategoryCalcInsight> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String InsightDateFieldName;
	public String InsightName;
	public String InsightScoreFieldName;
	public String InsightSubjectFieldName;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ScoreCategoryId;
	public ScoreCategory ScoreCategory;
	public Datetime SystemModstamp;

	public ScoreCategoryCalcInsight clone$() {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategoryCalcInsight clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategoryCalcInsight clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategoryCalcInsight clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategoryCalcInsight clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
