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
public class DatasetExport extends SObject {
	public static SObjectType$<DatasetExport> SObjectType;
	public static SObjectFields$<DatasetExport> Fields;

	public Integer CompressedMetadataLength;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Blob Metadata;
	public Integer MetadataLength;
	public String Owner;
	public String PublisherInfo;
	public String PublisherType;
	public String Status;
	public Datetime SystemModstamp;

	public DatasetExportPart[] DatasetExportParts;

	public DatasetExport clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatasetExport clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatasetExport clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatasetExport clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatasetExport clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
