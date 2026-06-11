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
public class ScoreRangeClassification extends SObject {
	public static SObjectType$<ScoreRangeClassification> SObjectType;
	public static SObjectFields$<ScoreRangeClassification> Fields;

	public String ClassificationName;
	public String ColorHexadecimalCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal RangeEndValue;
	public Decimal RangeStartValue;
	public Id ScoreCategoryId;
	public ScoreCategory ScoreCategory;
	public Datetime SystemModstamp;

	public ScoreRangeClassification clone$() {throw new java.lang.UnsupportedOperationException();}
	public ScoreRangeClassification clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ScoreRangeClassification clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ScoreRangeClassification clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ScoreRangeClassification clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
