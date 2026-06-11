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
public class DatasetExportPart extends SObject {
	public static SObjectType$<DatasetExportPart> SObjectType;
	public static SObjectFields$<DatasetExportPart> Fields;

	public Integer CompressedDataFileLength;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Blob DataFile;
	public Integer DataFileLength;
	public Id DatasetExportId;
	public DatasetExport DatasetExport;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Owner;
	public Integer PartNumber;
	public Datetime SystemModstamp;

	public DatasetExportPart clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatasetExportPart clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatasetExportPart clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatasetExportPart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatasetExportPart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
