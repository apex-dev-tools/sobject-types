/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class TransactionSecurityPolicy extends SObject {
	public static SObjectType$<TransactionSecurityPolicy> SObjectType;
	public static SObjectFields$<TransactionSecurityPolicy> Fields;

	public String ActionConfig;
	public Id ApexPolicyId;
	public ApexClass ApexPolicy;
	public String BlockMessage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomEmailContent;
	public String Description;
	public String DeveloperName;
	public String EventName;
	public String EventType;
	public Id ExecutionUserId;
	public User ExecutionUser;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String ResourceName;
	public String State;
	public Datetime SystemModstamp;
	public String Type;

	public TransactionSecurityPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public TransactionSecurityPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TransactionSecurityPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TransactionSecurityPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TransactionSecurityPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
