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
public class CombinedAttachment extends SObject {
	public static SObjectType$<CombinedAttachment> SObjectType;
	public static SObjectFields$<CombinedAttachment> Fields;

	public Integer ContentSize;
	public String ContentUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalDataSourceName;
	public String ExternalDataSourceType;
	public String FileExtension;
	public String FileType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public SObject Parent;
	public String RecordType;
	public String SharingOption;
	public String Title;

	public CombinedAttachment clone$() {throw new java.lang.UnsupportedOperationException();}
	public CombinedAttachment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CombinedAttachment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CombinedAttachment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CombinedAttachment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
