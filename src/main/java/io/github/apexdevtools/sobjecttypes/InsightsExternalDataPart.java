/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class InsightsExternalDataPart extends SObject {
	public static SObjectType$<InsightsExternalDataPart> SObjectType;
	public static SObjectFields$<InsightsExternalDataPart> Fields;

	public Integer CompressedDataLength;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Blob DataFile;
	public Integer DataLength;
	public Id Id;
	public Id InsightsExternalDataId;
	public InsightsExternalData InsightsExternalData;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer PartNumber;
	public Datetime SystemModstamp;

	public InsightsExternalDataPart clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalDataPart clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalDataPart clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalDataPart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalDataPart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
