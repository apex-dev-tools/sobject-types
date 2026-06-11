/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ActivationTargetSecureFTP extends SObject {
	public static SObjectType$<ActivationTargetSecureFTP> SObjectType;
	public static SObjectFields$<ActivationTargetSecureFTP> Fields;

	public Id ActivationTargetId;
	public ActivationTarget ActivationTarget;
	public String ChildDirectory;
	public String Compression;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CustomFileName;
	public String Delimiter;
	public String FileDateTimeSuffix;
	public String FileNameType;
	public Id Id;
	public Boolean IsCreateFolderWithInChildDir;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Long MaxFileSizeInBytes;
	public Long MaxRecordsPerFile;
	public String Name;
	public String PreDeterminedFileName;
	public Datetime SystemModstamp;

	public ActivationTargetSecureFTP clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivationTargetSecureFTP clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTargetSecureFTP clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTargetSecureFTP clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTargetSecureFTP clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
