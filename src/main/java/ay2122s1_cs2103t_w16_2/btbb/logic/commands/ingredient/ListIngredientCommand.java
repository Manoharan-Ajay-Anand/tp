package ay2122s1_cs2103t_w16_2.btbb.logic.commands.ingredient;

import static ay2122s1_cs2103t_w16_2.btbb.model.Model.PREDICATE_SHOW_ALL_INGREDIENTS;
import static java.util.Objects.requireNonNull;

import ay2122s1_cs2103t_w16_2.btbb.logic.commands.Command;
import ay2122s1_cs2103t_w16_2.btbb.logic.commands.CommandResult;
import ay2122s1_cs2103t_w16_2.btbb.model.Model;
import ay2122s1_cs2103t_w16_2.btbb.ui.UiTab;

/**
 * Lists all ingredients in btbb to the user.
 */
public class ListIngredientCommand extends Command {
    public static final String COMMAND_WORD = "list-i";

    public static final String MESSAGE_SUCCESS = "Listed all ingredients";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredIngredientList(PREDICATE_SHOW_ALL_INGREDIENTS);
        return new CommandResult(MESSAGE_SUCCESS, UiTab.INVENTORY);
    }
}