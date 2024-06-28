/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AccountingFieldMapping extends SObject {
	public static SObjectType$<AccountingFieldMapping> SObjectType;
	public static SObjectFields$<AccountingFieldMapping> Fields;

	public Id AccountingModelConfigId;
	public AccountingModelConfig AccountingModelConfig;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsForAllocationType;
	public Boolean IsForPaymentType;
	public Boolean IsForTransactionType;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MappingBehavior;
	public String MasterLabel;
	public String NamespacePrefix;
	public String SourceField;
	public Datetime SystemModstamp;
	public String TargetField;

	public AccountingFieldMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountingFieldMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountingFieldMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountingFieldMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountingFieldMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
