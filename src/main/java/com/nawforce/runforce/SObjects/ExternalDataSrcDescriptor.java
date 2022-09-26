/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExternalDataSrcDescriptor extends SObject {
	public static SObjectType$<ExternalDataSrcDescriptor> SObjectType;
	public static SObjectFields$<ExternalDataSrcDescriptor> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DescriptorVersion;
	public String DeveloperName;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Subtype;
	public Datetime SystemModstamp;
	public Integer SystemVersion;
	public String Type;

	public ExternalDataSrcDescriptor clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
