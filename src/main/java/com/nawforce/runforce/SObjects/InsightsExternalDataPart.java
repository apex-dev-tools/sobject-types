/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.*;

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
