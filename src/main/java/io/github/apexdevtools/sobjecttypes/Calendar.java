/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Calendar extends SObject {
	public static SObjectType$<Calendar> SObjectType;
	public static SObjectFields$<Calendar> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;
	public String Type;
	public Id UserId;
	public User User;

	public AcceptedEventRelation[] AcceptedEventRelations;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public EventRelation[] EventRelations;
	public UndecidedEventRelation[] UndecidedEventRelations;

	public Calendar clone$() {throw new java.lang.UnsupportedOperationException();}
	public Calendar clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Calendar clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Calendar clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Calendar clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
