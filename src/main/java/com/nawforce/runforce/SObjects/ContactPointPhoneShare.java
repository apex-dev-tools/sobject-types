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
public class ContactPointPhoneShare extends SObject {
	public static SObjectType$<ContactPointPhoneShare> SObjectType;
	public static SObjectFields$<ContactPointPhoneShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public ContactPointPhone Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public ContactPointPhoneShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
