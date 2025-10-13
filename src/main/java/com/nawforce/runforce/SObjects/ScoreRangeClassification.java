/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
