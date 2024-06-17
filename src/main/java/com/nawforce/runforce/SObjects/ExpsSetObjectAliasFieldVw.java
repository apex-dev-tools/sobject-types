/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExpsSetObjectAliasFieldVw extends SObject {
	public static SObjectType$<ExpsSetObjectAliasFieldVw> SObjectType;
	public static SObjectFields$<ExpsSetObjectAliasFieldVw> Fields;

	public String DurableId;
	public String ExpsSetDefVerVarField;
	public String FieldAlias;
	public Id Id;
	public String InstalledPackageName;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ManageableState;
	public String NamespacePrefix;
	public String ObjectAlias;
	public String ObjectApiName;
	public String SourceFieldDataType;
	public Integer SourceFieldDecimalScale;
	public String SourceFieldName;
	public String UsageType;

	public ExpsSetObjectAliasFieldVw clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
