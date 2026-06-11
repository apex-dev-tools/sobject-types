/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ScoreCategory extends SObject {
	public static SObjectType$<ScoreCategory> SObjectType;
	public static SObjectFields$<ScoreCategory> Fields;

	public String CategoryName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String IconUrl;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id ParentCategoryId;
	public ScoreCategory ParentCategory;
	public Datetime SystemModstamp;

	public ScoreCategory[] ChildScoreCategories;
	public ScoreCategoryCalcInsight[] ScoreCalcInsightConfigs;
	public ScoreRangeClassification[] ScoreRangeClassification_Category;

	public ScoreCategory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ScoreCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
