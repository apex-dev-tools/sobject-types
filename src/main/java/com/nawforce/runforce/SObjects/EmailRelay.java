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
public class EmailRelay extends SObject {
	public static SObjectType$<EmailRelay> SObjectType;
	public static SObjectFields$<EmailRelay> Fields;

	public String AuthType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Host;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRequireAuth;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Blob Password;
	public String Port;
	public Datetime SystemModstamp;
	public String TlsSetting;
	public String Username;

	public EmailDomainFilter[] Filters;

	public EmailRelay clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
