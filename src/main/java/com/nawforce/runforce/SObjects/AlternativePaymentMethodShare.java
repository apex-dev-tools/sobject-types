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
public class AlternativePaymentMethodShare extends SObject {
	public static SObjectType$<AlternativePaymentMethodShare> SObjectType;
	public static SObjectFields$<AlternativePaymentMethodShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public AlternativePaymentMethod Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public AlternativePaymentMethodShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethodShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethodShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethodShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethodShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
