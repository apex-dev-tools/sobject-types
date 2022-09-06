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
public class ContentVersionRating extends SObject {
	public static SObjectType$<ContentVersionRating> SObjectType;
	public static SObjectFields$<ContentVersionRating> Fields;

	public Id ContentVersionId;
	public ContentVersion ContentVersion;
	public Id Id;
	public Datetime LastModifiedDate;
	public Integer Rating;
	public String UserComment;
	public Id UserId;
	public User User;

	public ContentVersionRating clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
